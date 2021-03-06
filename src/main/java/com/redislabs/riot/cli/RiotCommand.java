package com.redislabs.riot.cli;

import com.redislabs.picocliredis.HelpCommand;
import com.redislabs.picocliredis.RedisOptions;
import com.redislabs.riot.Riot;

import picocli.CommandLine.Command;
import picocli.CommandLine.ParentCommand;

@Command(sortOptions = false)
public abstract class RiotCommand extends HelpCommand implements Runnable {

	@ParentCommand
	private Riot parent = new Riot();

	protected RedisOptions redisOptions() {
		return parent.getRedis();
	}

	protected boolean isQuiet() {
		return parent.isQuiet();
	}

}
