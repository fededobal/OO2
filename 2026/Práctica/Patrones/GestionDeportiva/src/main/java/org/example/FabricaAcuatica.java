package org.example;

public class FabricaAcuatica extends FabricaEquipamiento {
    @Override
    public Credencial fabricarCredencial() {
        return new PulseraSumergible();
    }

    @Override
    public Planilla fabricarPlanilla() {
        return new PlanillaPlastificada();
    }
}
