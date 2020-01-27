package hasan;
import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.inject.Named;
@Named("XB")
@Default
public class XBOX implements VolumeAdjustable {


	private String deviceVolume;
	private CountryOfOrigin coo;
	
	@Inject
	public XBOX(CountryOfOrigin coo_) {
		coo=coo_;
		deviceVolume="xbodvol:77";
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
