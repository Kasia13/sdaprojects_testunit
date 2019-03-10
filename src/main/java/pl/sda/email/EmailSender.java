package pl.sda.email;

import pl.sda.user.User;

import java.util.Random;

public class EmailSender {

    public boolean sendWelcomeTo(User user) {
//        Tu powinna być implementacja wysyłania maila ale na potrzeby naszych testów
//        zasymujmy sytuację w której nie zawsze operacja ta będzie kończyć się sukcesem.
//        Jeśli wylosowana zostanie liczba parzysta zostanie zwrócona wartość true symulująca poprawność wysłania maila.
//        Jeśli wylosowana zostanie liczba nieparzysta to zo metoda zwróci false symulując błąd podczas wysłania maila.

//        PAMIĘTAJ ŻE JEST TO TYLKO SYMULACJA NA POTRZEBY NASZYCH ZADAN!!!


        Random random = new Random();
        int result = random.nextInt(100);
        return result % 2 == 0;
    }
}
