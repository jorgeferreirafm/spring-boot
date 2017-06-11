package io.github.jffm.springboot.samples.utils;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@AllArgsConstructor
@EqualsAndHashCode
@Builder
@Getter
@Setter
public class LombokSample {
	
	private String value1;

	private String value2;
	
}