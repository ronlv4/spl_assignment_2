package bgu.spl.mics.application.services;

import bgu.spl.mics.MessageBusImpl;
import bgu.spl.mics.MicroService;

/**
 * TimeService is the global system timer There is only one instance of this micro-service.
 * It keeps track of the amount of ticks passed since initialization and notifies
 * all other micro-services about the current time tick using {@link TickBroadcast}.
 * This class may not hold references for objects which it is not responsible for.
 * 
 * You can add private fields and public methods to this class.
 * You MAY change constructor signatures and even add new public constructors.
 */
public class TimeService extends MicroService{

	private static TimeService instance = null;

	private TimeService() {
		super("Universal_Time_Service");
		// TODO Implement this
	}

	@Override
	protected void initialize() {
		// TODO Implement this
		
	}

	public static TimeService getInstance(){
		return instance != null? instance : new TimeService();
	}

}
