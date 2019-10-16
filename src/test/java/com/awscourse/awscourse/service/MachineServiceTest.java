package com.awscourse.awscourse.service;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.BDDMockito;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.awscourse.resource.DetailedMachine;
import com.awscourse.resource.Machine;
import com.awscourse.service.MachineService;

@SpringBootTest
@RunWith(SpringRunner.class)
public class MachineServiceTest {

	@Mock
	private MachineService service;

	@Test
	public void getMachineInformationTest() {
		Machine machine = mock(Machine.class);
		BDDMockito.given(service.getMachineInformation()).willReturn(machine);
		service.getMachineInformation();
		BDDMockito.verify(service).getMachineInformation();

		assertEquals(machine, service.getMachineInformation());
	}

	@Test
	public void getDetailedMachineInformationTest() {
		DetailedMachine detailed = mock(DetailedMachine.class);
		BDDMockito.given(service.getDetailedMachineInformation()).willReturn(detailed);
		service.getDetailedMachineInformation();
		BDDMockito.verify(service).getDetailedMachineInformation();

		assertEquals(detailed, service.getDetailedMachineInformation());
	}

}
