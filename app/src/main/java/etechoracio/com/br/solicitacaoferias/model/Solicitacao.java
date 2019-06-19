package etechoracio.com.br.solicitacaoferias.model;

import java.util.Date;

public class Solicitacao {

    private Date data;
    private Date dataFim;

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
}
