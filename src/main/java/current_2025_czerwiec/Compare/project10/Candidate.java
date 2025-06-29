package current_2025_czerwiec.Compare.project10;

import java.time.LocalDate;
import java.util.Optional;

public class Candidate {
	private final String name;
	private final Optional<LocalDate> interviewDate;
	private final int score;

	public Candidate(final String name, final Optional<LocalDate> interviewDate, final int score) {
		this.name = name;
		this.score = score;
		this.interviewDate = interviewDate;
	}

	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}

	public Optional<LocalDate> getInterviewDate() {
		return interviewDate;
	}

	public String toString() {
		return name + " | Interview: " + (interviewDate.isPresent() ? interviewDate.get() : "None") + " | Score: " + score;
	}
}
