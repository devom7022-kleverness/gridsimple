package com.devom.kleverness.mydraganddrop.data;

public class SceneItemProvider extends AbstractSceneDataProvider.Data {

    private final long id;
    private final int viewType;
    private String routineId;
    private String name;

    public SceneItemProvider(long id, int viewType, String routineId, String name) {
        this.id = id;
        this.viewType = viewType;
        this.routineId = routineId;
        this.name = name;
    }

    @Override
    public int getViewType() {
        return viewType;
    }

    @Override
    public long getId() {
        return id;
    }

    @Override
    public String getRoutineId() {
        return routineId;
    }

    @Override
    public String getName() {
        return name;
    }
}