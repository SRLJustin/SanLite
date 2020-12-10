package net.runelite.rs.api;

import net.runelite.api.Preferences;
import net.runelite.mapping.Import;

public interface RSClientPreferences extends Preferences
{
	@Import("rememberedUsername")
	@Override
	String getRememberedUsername();

	@Import("rememberedUsername")
	@Override
	void setRememberedUsername(String username);

	@Import("musicVolume")
	int getMusicVolume();

	@Import("musicVolume")
	void setMusicVolume(int volume);

	@Import("soundEffectsVolume")
	int getSoundEffectVolume();

	@Import("soundEffectsVolume")
	void setSoundEffectVolume(int i);

	@Import("areaSoundEffectsVolume")
	int getAreaSoundEffectVolume();

	@Import("areaSoundEffectsVolume")
	void setAreaSoundEffectVolume(int i);
}
