package com.awscourse.resource;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Machine implements Serializable {

	private static final long serialVersionUID = 2751090493991485706L;

	@JsonProperty("ip")
	private String ip;

	@JsonProperty("name")
	private String name;

	@JsonProperty("operation_system")
	private String operationSystem;

	@JsonProperty("version_operation_system")
	private String versionOperationSystem;

	@JsonProperty("architeture")
	private String architeture;

	public static class MachineBuilder {

		private Machine machine;

		private MachineBuilder(String ip) {
			machine = new Machine();
			machine.setIp(ip);
		}

		public static final MachineBuilder builder(String ip) {
			return new MachineBuilder(ip);
		}

		public MachineBuilder withName(String name) {
			machine.setName(name);
			return this;
		}

		public MachineBuilder withOperationSystem(String operationSystem) {
			machine.setOperationSystem(operationSystem);
			return this;
		}

		public MachineBuilder withVersionOperationSystem(String versionOperationSystem) {
			machine.setVersionOperationSystem(versionOperationSystem);
			return this;
		}

		public MachineBuilder withArchiteture(String architeture) {
			machine.setArchiteture(architeture);
			return this;
		}

		public Machine build() {
			return machine;
		}

	}

	public String getIp() {
		return ip;
	}

	protected void setIp(String ip) {
		this.ip = ip;
	}

	public String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	public String getOperationSystem() {
		return operationSystem;
	}

	protected void setOperationSystem(String operationSystem) {
		this.operationSystem = operationSystem;
	}

	public String getVersionOperationSystem() {
		return versionOperationSystem;
	}

	protected void setVersionOperationSystem(String versionOperationSystem) {
		this.versionOperationSystem = versionOperationSystem;
	}

	public String getArchiteture() {
		return architeture;
	}

	protected void setArchiteture(String architeture) {
		this.architeture = architeture;
	}

}
