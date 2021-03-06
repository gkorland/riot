package com.redislabs.riot.generator;

import java.util.Locale;

import com.github.javafaker.Faker;

public class GeneratorFaker extends Faker {

	private GeneratorReader reader;

	public GeneratorFaker(Locale locale, GeneratorReader reader) {
		super(locale);
		this.reader = reader;
	}

	public long index() {
		return reader.index();
	}

	public int partitions() {
		return reader.partitions();
	}

	public int partition() {
		return reader.partition();
	}

}
