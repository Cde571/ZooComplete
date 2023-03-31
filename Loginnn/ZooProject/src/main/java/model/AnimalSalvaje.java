package model;

public class AnimalSalvaje extends Animal{
    private int levelOfDanger;
    private boolean canBeCamouflajed;
    public AnimalSalvaje(String code, String nombre, String especie, String group, int nivelPeligrosidad, boolean canBeCamouflajed){
        super(code, nombre, especie, group);
        this.levelOfDanger = nivelPeligrosidad;
        this.canBeCamouflajed = canBeCamouflajed;

    }
    public void setLevelOfDanger(int levelOfDanger){
        this.levelOfDanger = levelOfDanger;
    }
    public int getLevelOfDanger(){
        return this.levelOfDanger;
    }

    public boolean isCanBeCamouflajed() {
        return canBeCamouflajed;
    }

    public void setCanBeCamouflajed(boolean canBeCamouflajed) {
        this.canBeCamouflajed = canBeCamouflajed;
    }
}
