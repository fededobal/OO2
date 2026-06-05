package org.example;

public class FabricaMusculacion extends FabricaEquipamiento {
    @Override
    public Credencial fabricarCredencial() {
        return new TarjetaMagnetica();
    }

    @Override
    public Planilla fabricarPlanilla() {
        return new PlanillaDigitalApp();
    }
}
