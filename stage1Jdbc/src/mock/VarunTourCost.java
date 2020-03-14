package mock;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;

public class VarunTourCost {

	public static void main(String[] args) throws SQLException, IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		TravelAgency vtr=new TravelAgency();
		List list=vtr.generatePackageCost("d://VarshTourPackageDetails.txt");
		Iterator<String> itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
			List list1=vtr.findPackagesWithMinimumNumberOfDays();
			Iterator itr1=list1.iterator();
			while(itr1.hasNext()) {
				Package p=(Package)itr1.next();
				System.out.println(p.getPackageId() + " " +p.getSourcePlace()+ " " + p.getDestinationPlace() + " " + p.getNoOfDays() + " " + p.getBasicFare());
		}

	}

}
}
