package hudson.plugins.selenium.callables;

import org.openqa.grid.internal.utils.SelfRegisteringRemote;

import hudson.remoting.Channel;
import hudson.remoting.ChannelProperty;

public class SeleniumConstants {
	
	public static final ChannelProperty<Channel> PROPERTY_JVM = new ChannelProperty<Channel>(Channel.class, "jvm");
	
	public static final ChannelProperty<String> PROPERTY_STATUS = new ChannelProperty<String>(String.class, "selenium.status");
	
	public static final ChannelProperty<Object> PROPERTY_LOCK = new ChannelProperty<Object>(Object.class, "selenium.lock");
	
	public static final ChannelProperty<SelfRegisteringRemote> PROPERTY_INSTANCE = new ChannelProperty<SelfRegisteringRemote>(SelfRegisteringRemote.class, "instance");
	
	public static final String STARTING = "starting";
	public static final String STARTED = "started";
	public static final String RESTARTING = "restarting";
	public static final String STOPPING = "stopping";
	public static final String STOPPED = "stopped";
}
