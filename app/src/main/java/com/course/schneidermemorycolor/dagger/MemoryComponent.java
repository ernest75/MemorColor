package com.course.schneidermemorycolor.dagger;

import com.course.schneidermemorycolor.GameScreen;
import com.course.schneidermemorycolor.PlayerData;
import com.course.schneidermemorycolor.fragments.EasyFragment;
import com.course.schneidermemorycolor.fragments.HardFragment;
import com.course.schneidermemorycolor.fragments.MediumFragment;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by ernestschneiderolcina on 20/3/18.
 */
@Singleton
@Component(modules = {AppModule.class})
public interface MemoryComponent {

    public void injectGameScreen(GameScreen gameScreen);
    public void injectPlayerData(PlayerData playerData);
    public void injectEasyFragment(EasyFragment easyFragment);
    public void injectMediumFragment(MediumFragment mediumFragment);
    public void injectHardFragment(HardFragment hardFragment);

}
