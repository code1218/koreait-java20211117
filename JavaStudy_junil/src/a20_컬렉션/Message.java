package a20_ÄÃ·º¼Ç;

import lombok.Data;

@Data
public class Message<T> {
	private int code;
	private T data;
}
