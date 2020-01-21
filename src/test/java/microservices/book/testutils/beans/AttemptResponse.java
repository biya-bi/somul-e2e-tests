/**
 * 
 */
package microservices.book.testutils.beans;

/**
 * @author biya-bi
 *
 */
public class AttemptResponse {

	private boolean correct;
	private long attemptId;
	private long userId;

	public AttemptResponse() {
	}

	public boolean isCorrect() {
		return correct;
	}

	public void setCorrect(boolean correct) {
		this.correct = correct;
	}

	public long getAttemptId() {
		return attemptId;
	}

	public void setAttemptId(long attemptId) {
		this.attemptId = attemptId;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

}