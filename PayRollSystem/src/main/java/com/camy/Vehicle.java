package com.camy;

public class Vehicle
{
    private String vehicle;

    private void checkVehicle(StringBuilder stringBuilder) {
        if (vehicle == null) {
            stringBuilder.append("Employee has no vehicle registered");
        } else if (vehicle instanceof Car) {
            stringBuilder.append("Employee has a Car\n")
                    .append(" -Make: ").append(getVehicle().getMake())
                    .append("\n -Plate: ").append(getVehicle().getPlate())
                    .append("\n -Color: ").append(getVehicle().getColor())
                    .append("\n -Distance Travelled: ").append(((Car)getVehicle()).getDistanceTravelled())
                    .append("\n -Capacity: ").append(((Car)getVehicle()).getCapacity());

        } else if (vehicle instanceof Motorcycle) {
            stringBuilder.append("Employee has a MotorCycle\n")
                    .append(" -Make: ").append(getVehicle().getMake())
                    .append("\n -Plate: ").append(getVehicle().getPlate())
                    .append("\n -Color: ").append(getVehicle().getColor())
                    .append("\n -Distance Travelled: ").append(((Motorcycle)getVehicle()).getDistanceTravelled())
            ;
        }
    }
}
