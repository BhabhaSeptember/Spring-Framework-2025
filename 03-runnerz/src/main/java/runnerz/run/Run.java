<<<<<<< HEAD
package runnerz.run;

import java.time.LocalDateTime;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Positive;

public record Run(
		Integer id,	
		@NotEmpty
		String title,
		LocalDateTime startedOn,
		LocalDateTime completedOn,	
		@Positive
		Integer km,
		Location location
		) {
	
	public Run {
		if(!completedOn.isAfter(startedOn)) {
			throw new IllegalArgumentException("Completed On must be after Started On");
		}
	}
}
=======
package runnerz.run;

import java.time.LocalDateTime;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Positive;

public record Run(
		Integer id,	
		@NotEmpty
		String title,
		LocalDateTime startedOn,
		LocalDateTime completedOn,	
		@Positive
		Integer km,
		Location location
		) {
	
	public Run {
		if(!completedOn.isAfter(startedOn)) {
			throw new IllegalArgumentException("Completed On must be after Started On");
		}
	}
}
>>>>>>> 628b3ad (commit)
