package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import java.util.List;

public class ExcavatorProducerImpl implements MachineProducer {
    @Override
    public List<Machine> get() {
        return List.of(new Excavator(), new Excavator(), new Excavator());
    }
}
