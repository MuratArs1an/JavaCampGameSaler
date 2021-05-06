package adapter;

import java.rmi.RemoteException;

import Entities.User;
import interfaces.UserCheckService;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements UserCheckService {

	@Override
	public boolean loginControl(User user) {
		KPSPublicSoapProxy client= new KPSPublicSoapProxy();
		try {
			return client.TCKimlikNoDogrula(user.getNationalId(),user.getFirstName().toUpperCase(),user.getLastName().toUpperCase(),user.getBirthYear());
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

}
