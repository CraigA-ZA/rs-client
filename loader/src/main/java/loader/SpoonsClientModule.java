package loader;/*
 * Copyright (c) 2016-2017, Adam <Adam@sigterm.info>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */


import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import lombok.AllArgsConstructor;

import javax.inject.Singleton;
import java.applet.Applet;
import java.util.function.Supplier;

@AllArgsConstructor
public class SpoonsClientModule extends AbstractModule {

    private final Applet applet;
//	private final Supplier<RuntimeConfig> configSupplier;
//	private final File config;

    @Override
    protected void configure() {
        // bind properties
//		Properties properties = RuneLiteProperties.getProperties();
//		for (String key : properties.stringPropertyNames())
//		{
//			String value = properties.getProperty(key);
//			bindConstant().annotatedWith(Names.named(key)).to(value);
//		}

        // bind runtime config
//		RuntimeConfig runtimeConfig = configSupplier.get();
//		if (runtimeConfig != null && runtimeConfig.getProps() != null)
//		{
//			for (Map.Entry<String, ?> entry : runtimeConfig.getProps().entrySet())
//			{
//				if (entry.getValue() instanceof String)
//				{
//					ConstantBindingBuilder binder = bindConstant().annotatedWith(Names.named(entry.getKey()));
//					binder.to((String) entry.getValue());
//				}
//				else if (entry.getValue() instanceof Double)
//				{
//					ConstantBindingBuilder binder = bindConstant().annotatedWith(Names.named(entry.getKey()));
//					if (DoubleMath.isMathematicalInteger((double) entry.getValue()))
//					{
//						binder.to((int) (double) entry.getValue());
//					}
//					else
//					{
//						binder.to((double) entry.getValue());
//					}
//				}
//				else if (entry.getValue() instanceof Boolean)
//				{
//					ConstantBindingBuilder binder = bindConstant().annotatedWith(Names.named(entry.getKey()));
//					binder.to((boolean) entry.getValue());
//				}
//			}
//		}

//		bind(OptionSet.class).annotatedWith(Names.named("clientArgs")).toInstance(optionSet);
//		bindConstant().annotatedWith(Names.named("developerMode")).to(developerMode);
//		bindConstant().annotatedWith(Names.named("safeMode")).to(safeMode);
//		bind(File.class).annotatedWith(Names.named("sessionfile")).toInstance(sessionfile);
//		bind(File.class).annotatedWith(Names.named("config")).toInstance(config);
//		bind(ScheduledExecutorService.class).toInstance(new ExecutorServiceExceptionLogger(Executors.newSingleThreadScheduledExecutor()));
//		bind(OkHttpClient.class).toInstance(okHttpClient);
//		bind(MenuManager.class);
//		bind(ChatMessageManager.class);
//		bind(ItemManager.class);
//		bind(Scheduler.class);
//		bind(PluginManager.class);
//		bind(SessionManager.class);

//		bind(Gson.class).toInstance(RuneLiteAPI.GSON);

//		bind(Callbacks.class).to(Hooks.class);

//		bind(EventBus.class)
//				.toInstance(new EventBus());

//		bind(EventBus.class)
//				.annotatedWith(Names.named("Deferred EventBus"))
//				.to(DeferredEventBus.class);

//		requestStaticInjection(
//				Static.class
//		);

//		Properties unethicaliteProperties = UnethicaliteProperties.getProperties();
//		for (String key : unethicaliteProperties.stringPropertyNames())
//		{
//			String value = unethicaliteProperties.getProperty(key);
//			bindConstant().annotatedWith(Names.named(key)).to(value);
//		}
    }

    @Provides
    @Singleton
    Applet provideApplet() {
        return applet;
    }

//	@Provides
//	@Singleton
//	Client provideClient(@Nullable Applet applet)
//	{
//		return applet instanceof Client ? (Client) applet : null;
//	}

//	@Provides
//	@Singleton
//	RuntimeConfig provideRuntimeConfig()
//	{
//		return configSupplier.get();
//	}
//
//	@Provides
//	@Singleton
//	RuneLiteConfig provideConfig(ConfigManager configManager)
//	{
//		return configManager.getConfig(RuneLiteConfig.class);
//	}
//
//	@Provides
//	@Singleton
//	ChatColorConfig provideChatColorConfig(ConfigManager configManager)
//	{
//		return configManager.getConfig(ChatColorConfig.class);
//	}
//
//	@Provides
//	@Named("runelite.api.base")
//	HttpUrl provideApiBase(@Named("runelite.api.base") String s)
//	{
//		final String prop = System.getProperty("runelite.http-service.url");
//		return HttpUrl.get(Strings.isNullOrEmpty(prop) ? s : prop);
//	}
//
//	@Provides
//	@Named("runelite.session")
//	HttpUrl provideSession(@Named("runelite.session") String s)
//	{
//		final String prop = System.getProperty("runelite.session.url");
//		return HttpUrl.get(Strings.isNullOrEmpty(prop) ? s : prop);
//	}
//
//	@Provides
//	@Named("runelite.static.base")
//	HttpUrl provideStaticBase(@Named("runelite.static.base") String s)
//	{
//		final String prop = System.getProperty("runelite.static.url");
//		return HttpUrl.get(Strings.isNullOrEmpty(prop) ? s : prop);
//	}
//
//	@Provides
//	@Named("runelite.ws")
//	HttpUrl provideWs(@Named("runelite.ws") String s)
//	{
//		final String prop = System.getProperty("runelite.ws.url");
//		return HttpUrl.get(Strings.isNullOrEmpty(prop) ? s : prop);
//	}
//
//	@Provides
//	@Singleton
//	OpenOSRSConfig provideOpenOSRSConfig(ConfigManager configManager)
//	{
//		return configManager.getConfig(OpenOSRSConfig.class);
//	}
//
//	@Provides
//	@Singleton
//	ExecutorService provideExecutorService()
//	{
//		int poolSize = 2 * Runtime.getRuntime().availableProcessors();
//
//		// Will start up to poolSize threads (because of allowCoreThreadTimeOut) as necessary, and times out
//		// unused threads after 1 minute
//		ThreadPoolExecutor executor = new ThreadPoolExecutor(poolSize, poolSize,
//				60L, TimeUnit.SECONDS,
//				new LinkedBlockingQueue<>(),
//				new ThreadFactoryBuilder().setNameFormat("worker-%d").build());
//		executor.allowCoreThreadTimeOut(true);
//
//		return new NonScheduledExecutorServiceExceptionLogger(executor);
//	}
//
//	@Provides
//	@Singleton
//	@Nullable
//	ClientPacket provideClientPacket(@Nullable Client client)
//	{
//		assert client != null;
//		return client.createClientPacket(-1, -1);
//	}
//
//	@Provides
//	@Singleton
//	@Nullable
//	ServerPacket provideServerPacket(@Nullable Client client)
//	{
//		assert client != null;
//		return client.createServerPacket(-1, -1);
//	}
//
//	@Provides
//	@Singleton
//	GlobalCollisionMap provideGlobalCollisionMap(@Named("unethicalite.api.url") String apiUrl) throws IOException
//	{
//		return GlobalCollisionMap.fetchFromUrl(apiUrl + "/regions");
//	}
//
//	@Provides
//	@Singleton
//	UnethicaliteConfig provideUnethicaliteConfig(ConfigManager configManager)
//	{
//		return configManager.getConfig(UnethicaliteConfig.class);
//	}
}
