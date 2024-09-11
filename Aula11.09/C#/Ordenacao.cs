using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Aula1109
{
    internal class Ordenacao
    {
        public static void pente(List<Aluno> lista)
        {
            int distancia = lista.Count();
            Aluno tmp;
            int i;
            bool houveTroca;

            do
            {
                distancia = (int)(distancia / 1.3);
                if (distancia < 1) distancia = 1;
                houveTroca = false;
                for (i = 0; i + distancia < lista.Count(); i++)
                {
                    if (lista[i].CompareTo(lista[i + distancia]) > 0)
                    {
                        houveTroca = true;
                        tmp = lista[i];
                        lista[i] = lista[i + distancia];
                        lista[i + distancia] = tmp;
                    }
                }
            } while (distancia > 1 || houveTroca);
        }

        public static void bolha(List<Aluno> lista)
        {
            Aluno tmp;
            int i;
            bool houveTroca;

            do
            {
                houveTroca = false;
                for (i = 0; i < lista.Count() - 1; i++)
                {
                    if (lista[i].CompareTo(lista[i + 1]) > 0)
                    {
                        houveTroca = true;
                        tmp = lista[i];
                        lista[i] = lista[i + 1];
                        lista[i + 1] = tmp;
                    }
                }
            } while (houveTroca);
        }
    }
}