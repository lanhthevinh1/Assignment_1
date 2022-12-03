package com.vti.entity;

public class Position {
    private int positionId;
    private PositionName positionName;

    public enum PositionName{
        Dev, Test, ScrumMaster, PM;
    }

    public Position() {
    }

    public Position(int positionId) {
        this.positionId = positionId;
    }

    public Position(int positionId, PositionName positionName) {
        this.positionId = positionId;
        this.positionName = positionName;
    }

    public int getPositionId() {
        return positionId;
    }

    public void setPositionId(int positionId) {
        this.positionId = positionId;
    }

    public PositionName getPositionName() {
        return positionName;
    }

    public void setPositionName(PositionName positionName) {
        this.positionName = positionName;
    }

    @Override
    public String toString() {
        return "Account{" +
                "positionId=" + positionId +
                ", positionName=" + positionName +
                '}';
    }
}
