package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import core.mate.academy.model.Workable;
import java.util.ArrayList;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl implements MachineService<Machine> {

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        if (type == Bulldozer.class) {
            List<Bulldozer> bulldozers = new BulldozerProducerImpl().get();
            return new ArrayList<>(bulldozers);
        }

        if (type == Excavator.class) {
            List<Excavator> excavators = new ExcavatorProducerImpl().get();
            return new ArrayList<>(excavators);
        }

        if (type == Truck.class) {
            List<Truck> trucks = new TruckProducerImpl().get();
            return new ArrayList<>(trucks);
        }

        return List.of();
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        machines.replaceAll(ignored -> value);
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        machines.forEach(Workable::doWork);
    }
}
