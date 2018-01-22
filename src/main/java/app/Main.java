package app;

import beans.Child;
import io.ebean.EbeanServerFactory;
import io.ebean.config.ServerConfig;
import org.avaje.datasource.DataSourceConfig;

import java.lang.reflect.Field;

public class Main {

	public static void main(String[] args) throws Exception {
//		EbeanServerFactory.create("MyServer");
		DataSourceConfig dataSourceConfig = new DataSourceConfig();
		dataSourceConfig.setUsername("postgres");
		dataSourceConfig.setPassword("blah");
		dataSourceConfig.setDriver("org.postgresql.Driver");
		dataSourceConfig.setUrl("jdbc:postgresql://localhost:5432/rss_qa");

		ServerConfig serverConfig = new ServerConfig();
		serverConfig.setDataSourceConfig(dataSourceConfig);
		serverConfig.setRegister(true);
		serverConfig.setDefaultServer(true);
		serverConfig.addPackage("beans");
		EbeanServerFactory.create(serverConfig);

		Child c = new Child();
		Field field = Child.class.getField("_ebean_props");
		String[] value = (String[]) field.get(c);

		StringBuilder sb = new StringBuilder();
		sb.append(field.getName());
		sb.append(" is ");
		sb.append(field.get(c));
		sb.append(" of size ");
		sb.append(value.length);
		sb.append(" and first element ");
		sb.append(value[0]);
		System.out.println(sb.toString());
//		config.loadFromProperties();
//		Ebean.beginTransaction();
	}

	/*
	private static ServerConfig createServerConfig() throws Exception {
		ServerConfig result = new ServerConfig();
		result.setRegister(true);
		result.setDefaultServer(false);
		result.setExplicitTransactionBeginMode(true);
		result.addPackage("beans");
		result.setName("MyServer");
		result.setDatabasePlatform(new PostgresPlatform()); // Necessary?
//		result.setDataSource(createDataSource());
		return result;
	}

	private static DataSource createDataSource() throws Exception {
		PGSimpleDataSource result = new PGSimpleDataSource();
		result.setUrl("jdbc:postgresql://localhost:5432/rss_qa");
		result.setUser("postgres");
		result.setPassword("blah");
		return result;
	}
*/
}
