package hasan;

import javax.enterprise.inject.Alternative;
import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.inject.Named;

@Named("CDP")
@Alternative
public class CDPlayer implements VolumeAdjustable {

	private String deviceVolume;
	private CountryOfOrigin coo;
	
	@Inject
	public CDPlayer(CountryOfOrigin coo_) {
		coo=coo_;
		deviceVolume="CDPlayervol:77";
	}
	public static int deviceID=1;
	@Override
	public String getDeviceVolume() {
		// TODO Auto-generated method stub
		return deviceVolume+coo.getCOO();
	}

	@Override
	public void setDeviceVolume(String deviceVolume) {
		// TODO Auto-generated method stub
		this.deviceVolume = deviceVolume;
	}
	
	

}
