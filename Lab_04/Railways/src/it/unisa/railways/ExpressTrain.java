package it.unisa.railways;

import java.util.List;

public class ExpressTrain {
    private final TrainStop StazioneDiPartenza;
    private final TrainStop StazioneDiArrivo;
    private final List<TrainStop> FermateIntermedie;
    private final double KmPercorsi;
    private final int NumeroDiPosti;

    public ExpressTrain( TrainStop StazioneDiPartenza, TrainStop StazioneDiArrivo, List<TrainStop> FermateIntermedie, double KmPercorsi, int NumeroDiPosti)
    {
        this.StazioneDiPartenza = StazioneDiPartenza;
        this.StazioneDiArrivo = StazioneDiArrivo;
        this.FermateIntermedie = FermateIntermedie;
        this.KmPercorsi = KmPercorsi;
        this.NumeroDiPosti = NumeroDiPosti;
    }

    public TrainStop ReturnPartenza()
    {
        return StazioneDiPartenza;
    }

    public  TrainStop ReturnArrivo()
    {
        return StazioneDiArrivo;
    }
    public List<TrainStop> ReturnIntermedie()
    {
        return FermateIntermedie;
    }
    public int ReturnPosti()
    {
        return NumeroDiPosti;
    }

    public double ReturnKmPercorsi()
    {
        return KmPercorsi;
    }

    public int ReturnFermateTotali()
    {
        return this.FermateIntermedie.size() + 2;
    }

    public double CalcolaCosti( double serviceRevenuePerKmPerson, double resturantRevenuePerKmPerson)
    {
        double ServiceRevenue = this.KmPercorsi * this.NumeroDiPosti * serviceRevenuePerKmPerson;
        double resturantRevenue = this.KmPercorsi * this.NumeroDiPosti * resturantRevenuePerKmPerson;
        return ServiceRevenue + resturantRevenue;
    }

}
