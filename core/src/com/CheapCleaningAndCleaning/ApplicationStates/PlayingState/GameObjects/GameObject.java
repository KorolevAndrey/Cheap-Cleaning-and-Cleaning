package com.CheapCleaningAndCleaning.ApplicationStates.PlayingState.GameObjects;

public abstract class GameObject {
    public float x;
    public float y;

    public abstract void update();
    public abstract void draw();
}