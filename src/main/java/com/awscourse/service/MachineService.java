package com.awscourse.service;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.jboss.logging.Logger;
import org.springframework.stereotype.Service;

import com.awscourse.resource.DetailedMachine;
import com.awscourse.resource.Machine;
import com.awscourse.resource.DetailedMachine.DetailedMachineBuilder;
import com.awscourse.resource.Machine.MachineBuilder;

@Service
public class MachineService {

	private static final Logger LOG = Logger.getLogger(MachineService.class);

	public Machine getMachineInformation() {
		InetAddress adress = null;
		try {
			adress = InetAddress.getLocalHost();
		} catch (UnknownHostException e) {
			LOG.error("Erro ao tentar capturar as informacoes basicas da maquina local, error: " + e.getMessage(), e);
		}

		return MachineBuilder.builder(adress.getHostAddress()).withArchiteture(System.getProperty("os.arch"))
				.withName(adress.getHostName()).withOperationSystem(System.getProperty("os.name"))
				.withVersionOperationSystem(System.getProperty("os.version")).build();
	}

	public DetailedMachine getDetailedMachineInformation() {
		InetAddress adress = null;
		try {
			adress = InetAddress.getLocalHost();
		} catch (UnknownHostException e) {
			LOG.error("Erro ao tentar capturar as informacoes detalhadas da maquina local, error: " + e.getMessage(),
					e);
		}
		return DetailedMachineBuilder.builder(System.getProperty("java.version"))
				.withArchiteture(System.getProperty("os.arch")).withJavaVendor(System.getProperty("java.vendor"))
				.withJavaVendorUrl(System.getProperty("java.vendor.url")).withName(adress.getHostName())
				.withOperationSystem(System.getProperty("os.name")).withIp(adress.getHostAddress())
				.withVersionOperationSystem(System.getProperty("os.version")).build();
	}
}
