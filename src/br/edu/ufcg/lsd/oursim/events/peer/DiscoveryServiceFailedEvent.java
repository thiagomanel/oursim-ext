package br.edu.ufcg.lsd.oursim.events.peer;

import br.edu.ufcg.lsd.oursim.OurSim;
import br.edu.ufcg.lsd.oursim.events.AbstractEvent;
import br.edu.ufcg.lsd.oursim.events.Event;

public class DiscoveryServiceFailedEvent extends AbstractEvent {

	public DiscoveryServiceFailedEvent(Long time) {
		super(time, Event.DEF_PRIORITY, null);
	}

	@Override
	public void process(OurSim ourSim) {
		System.out.println("DS failed at " + getTime());
	}

}
