package org.fleni.cda.process.select;

import java.util.Date;
import java.util.List;

import org.fleni.cda.ReportCdaProcessApplication;
import org.fleni.cda.process.repository.ISidcaDataRepo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;;

/**
 * 
 * @author sescudero
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ReportCdaProcessApplication.class)
@SpringBootTest
public class SelectHugeTableTests {

	/**
	 * 
	 */
	@Autowired
	private ISidcaDataRepo sidcaDataRepo;

	/**
	 * 
	 */
	@Test()
	public void selectRObjectID() {
		String query = "select r_object_id from hce_radiologia";
		long init = System.currentTimeMillis();
		List<String> lst = sidcaDataRepo.selectRobjectId(query);
		long end = System.currentTimeMillis();
		System.out.println("milis " + (end - init));
		Assert.assertNotNull(lst);
	}
}
