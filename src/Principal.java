import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.Recomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

class Principal{
        public static void main(String[]args){
                Filme meuFilme = new Filme();
                meuFilme.setNome("Princesa Mononoke");
                meuFilme.setAnoLancamento(1990);
                meuFilme.setDuracaoMinutos(110);
                meuFilme.setIncluidoPlano(true);
                meuFilme.exibeFichaTecnico();
                meuFilme.avalia(1);
                meuFilme.avalia(1);
                System.out.println(meuFilme.getDuracaoMinutos());
                //meuFilme.totalAvaliacoes=10;
                System.out.println("Meu filme possui "+meuFilme.getTotalAvaliacoes()+" avaliações");
                System.out.println(meuFilme.mediaAvaliacoes());



                Serie lost = new Serie();
                lost.setNome("Lost");
                lost.setAnoLancamento(2000);
                lost.exibeFichaTecnico();
                lost.setTemporadas(10);
                lost.setEpsPorTemporada(10);
                lost.setMinutosPorEpisodio(50);
                System.out.println("Duração para maratonar lost :"+lost.getDuracaoMinutos());

                CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
                calculadora.inclui(meuFilme);

                Filme outroFilme = new Filme();
                outroFilme.setNome("Avatar Mononoke");
                outroFilme.setAnoLancamento(1990);
                outroFilme.setDuracaoMinutos(90);

                calculadora.inclui(outroFilme);
                calculadora.inclui(lost);
                System.out.println(calculadora.getTempoTotal());

                Recomendacao filtro = new Recomendacao();
                filtro.filtra(meuFilme);

                Episodio episodio = new Episodio();
                episodio.setNumero(10);
                episodio.setSerie(lost);
                episodio.setTotalVisualizacoes(300);
                filtro.filtra(episodio);

        }
}