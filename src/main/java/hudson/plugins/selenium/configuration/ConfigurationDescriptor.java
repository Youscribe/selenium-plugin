package hudson.plugins.selenium.configuration;

import hudson.model.Descriptor;

public abstract class ConfigurationDescriptor extends
		Descriptor<Configuration> {

	// define additional constructor parameters if you want
	protected ConfigurationDescriptor(
			Class<? extends Configuration> clazz) {
		super(clazz);
	}

	protected ConfigurationDescriptor() {
	}
	
}
