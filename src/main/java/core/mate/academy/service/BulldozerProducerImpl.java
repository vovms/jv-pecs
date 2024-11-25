package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Machine;
import java.util.List;

public class BulldozerProducerImpl implements MachineProducer {
    @Override
    public List<Machine> get() {
        return List.of(new Bulldozer(), new Bulldozer(), new Bulldozer());
    }
}
