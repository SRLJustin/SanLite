/*
 * Copyright (c) 2019, Lucas <https://github.com/Lucwousin>
 * All rights reserved.
 *
 * This code is licensed under GPL3, see the complete license in
 * the LICENSE file in the root directory of this submodule.
 */
package net.runelite.injector;

import lombok.extern.slf4j.Slf4j;
import net.runelite.injector.injection.InjectData;
import net.runelite.injector.rsapi.RSApi;
import net.runelite.injector.rsapi.RSApiClass;
import net.runelite.injector.rsapi.RSApiMethod;
import lombok.RequiredArgsConstructor;
import net.runelite.asm.ClassFile;
import net.runelite.asm.pool.Class;
import static net.runelite.injector.rsapi.RSApi.API_BASE;

@RequiredArgsConstructor
@Slf4j
public class InjectorValidator implements Validator
{
	private static final String OK = "OK", ERROR = "ERROR", WTF = "WTF";
	private final InjectData inject;

	private int missing = 0, okay = 0, notFound = 0;

	public boolean validate()
	{
		final RSApi rsApi = inject.getRsApi();
		for (ClassFile cf : inject.getVanilla())
		{
			for (Class intf : cf.getInterfaces())
			{
				if (!intf.getName().startsWith(API_BASE))
				{
					continue;
				}

				RSApiClass apiClass = rsApi.findClass(intf.getName());
				if (apiClass == null)
				{
					log.error("{} is rs-api type implemented by {} but does not exist in rs-api", intf, cf.getPoolClass());
					++notFound;
					continue;
				}

				check(cf, apiClass);
			}
		}

		String status = notFound > 0 ? WTF : missing > 0 ? ERROR : OK;
		log.info("[INFO] RSApiValidator completed. Status [{}] {} overridden methods, {} missing", status, okay, missing);

		// valid, ref to static final field
		return status == OK;
	}

	private void check(ClassFile clazz, RSApiClass apiClass)
	{
		for (RSApiMethod apiMethod : apiClass)
		{
			if (apiMethod.isSynthetic() || apiMethod.isDefault())
			{
				continue;
			}

			if (clazz.findMethodDeep(apiMethod.getName(), apiMethod.getSignature()) == null)
			{
				log.error("[WARN] Class {} implements interface {} but doesn't implement {}",
					clazz.getPoolClass(), apiClass.getClazz(), apiMethod.getMethod());
				++missing;
			}
			else
			{
				++okay;
			}
		}
	}
}
