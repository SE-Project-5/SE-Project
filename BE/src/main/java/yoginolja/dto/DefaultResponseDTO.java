package yoginolja.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import yoginolja.utils.ResponseMessage;
import yoginolja.utils.StatusCode;

@Data
@AllArgsConstructor
@Builder
public class DefaultResponseDTO<T> {

    private int status;
    private String msg;
    private T data;

    public DefaultResponseDTO(int status, String msg) {
        this.status = status;
        this.msg = msg;
        this.data =null;
    }

    public static <T> DefaultResponseDTO<T> res(final int status, final String msg){
        return res(status,msg,null);
    }

    public static <T> DefaultResponseDTO<T> res(final int status, final String msg, final T t){
        return DefaultResponseDTO.<T>builder()
                .data(t)
                .status(status)
                .msg(msg)
                .build();
    }

    public static final DefaultResponseDTO FAIL_DETAIL_RES
            = new DefaultResponseDTO(StatusCode.INTERNAL_SERVER_ERROR, ResponseMessage.INTERNAL_SERVER_ERROR);
}
