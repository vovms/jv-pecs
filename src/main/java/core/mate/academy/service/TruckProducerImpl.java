package core.mate.academy.service;

import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducerImpl implements MachineProducer {
    @Override
    public List<Machine> get() {
        return List.of(new Truck(), new Truck(), new Truck());
    }
}
