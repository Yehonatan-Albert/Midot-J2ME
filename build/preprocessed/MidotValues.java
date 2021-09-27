public class MidotValues {
    public int beytza, log, kav, sea, eyfa, kor;
    public int pruta, isar, pundyon, maa, dinar, sela;

    public MidotValues()
    {
        beytza = 1;
        log = beytza * 6;
        kav = log * 4;
        sea = kav * 6;
        eyfa = sea * 3;
        kor = eyfa * 10;
        
        pruta = 1;
        isar = pruta * 8;
        pundyon = isar * 2;
        maa = pundyon * 2;
        dinar = maa * 6;
        sela = dinar * 4;
    }
}
