package com.awscourse.resource;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DetailedMachine extends Machine implements Serializable {

	private static final long serialVersionUID = 7994122601491533156L;

	@JsonProperty("java_version")
	private String javaVersion;

	@JsonProperty("java_vendor")
	private String javaVendor;

	@JsonProperty("java_vendor_url")
	private String javaVendorUrl;

	public static class DetailedMachineBuilder {

		private DetailedMachine detailedMachine;

		private DetailedMachineBuilder(String javaVersion) {
			detailedMachine = new DetailedMachine();
			detailedMachine.setJavaVersion(javaVersion);
		}

		public static final DetailedMachineBuilder builder(String javaVersion) {
			return new DetailedMachineBuilder(javaVersion);
		}

		public DetailedMachineBuilder withIp(String ip) {
			detailedMachine.setIp(ip);
			return this;
		}

		public DetailedMachineBuilder withJavaVendor(String javaVendor) {
			detailedMachine.setJavaVendor(javaVendor);
			return this;
		}

		public DetailedMachineBuilder withJavaVendorUrl(String javaVendorUrl) {
			detailedMachine.setJavaVendorUrl(javaVendorUrl);
			return this;
		}

		public DetailedMachineBuilder withName(String name) {
			detailedMachine.setName(name);
			return this;
		}

		public DetailedMachineBuilder withOperationSystem(String operationSystem) {
			detailedMachine.setOperationSystem(operationSystem);
			return this;
		}

		public DetailedMachineBuilder withVersionOperationSystem(String versionOperationSystem) {
			detailedMachine.setVersionOperationSystem(versionOperationSystem);
			return this;
		}

		public DetailedMachineBuilder withArchiteture(String architeture) {
			detailedMachine.setArchiteture(architeture);
			return this;
		}

		public DetailedMachine build() {
			return detailedMachine;
		}
	}

	public String getJavaVersion() {
		return javaVersion;
	}

	public void setJavaVersion(String javaVersion) {
		this.javaVersion = javaVersion;
	}

	public String getJavaVendor() {
		return javaVendor;
	}

	public void setJavaVendor(String javaVendor) {
		this.javaVendor = javaVendor;
	}

	public String getJavaVendorUrl() {
		return javaVendorUrl;
	}

	public void setJavaVendorUrl(String javaVendorUrl) {
		this.javaVendorUrl = javaVendorUrl;
	}

}
