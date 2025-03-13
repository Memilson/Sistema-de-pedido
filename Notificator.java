// Classe base para notificadores
public abstract class Notificador {
    public abstract void enviarNotificacao(String mensagem);
}

// Implementação para notificação por e-mail
public class EmailNotificador extends Notificador {
    @Override
    public void enviarNotificacao(String mensagem) {
        System.out.println("Enviando e-mail: " + mensagem);
    }
}

// Implementação para notificação por SMS
public class SmsNotificador extends Notificador {
    @Override
    public void enviarNotificacao(String mensagem) {
        System.out.println("Enviando SMS: " + mensagem);
    }
}