package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducerImpl implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        return List.of(new Bulldozer(), new Bulldozer(), new Bulldozer());
    }
}
