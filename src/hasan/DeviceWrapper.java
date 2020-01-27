package hasan;

import javax.inject.Inject;
import javax.inject.Named;

public class DeviceWrapper {

	@Inject
	public VolumeAdjustable va;
	@Inject @Named("Television")
	public VolumeAdjustable tv;
	@Inject @Named("Radio")
	public VolumeAdjustable rd;
	@Inject @Named("XB")
	public VolumeAdjustable xb;
	@Inject @Named("PlayS")
	public  VolumeAdjustable ps;
	
}
