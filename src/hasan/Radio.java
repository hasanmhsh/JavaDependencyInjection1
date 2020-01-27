package hasan;

import javax.enterprise.inject.Alternative;
import javax.inject.Inject;
import javax.inject.Named;

@Named("Radio")
@Alternative
public class Radio implements VolumeAdjustable {


	private String deviceVolume;
	private CountryOfOrigin coo;
	
	@Inject
	public Radio(CountryOfOrigin coo_) {
		coo=coo_;
		deviceVolume="radvol:77";
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
