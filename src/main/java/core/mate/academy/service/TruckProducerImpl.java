package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducerImpl implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        return List.of(new Truck(), new Truck(), new Truck());
    }
}
