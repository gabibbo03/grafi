# Grafi
Libreria che vuole modellare tutti gli oggetti matematici legati alla teoria dei grafi.Tra le molte implementazioni che si possono utilizzare per descrivere questo oggetto,si può decidere di usare gli strumenti che il linguaggio ad oggetti fornisce a un programmatore attraverso anche l'applicazione dei design patterns.
# Classi: 

## NODI:
Modellano il concetto di vertice all'interno del grafo.La sua specializzazione WeightedNode permette di aggiungere un peso associato a quel nodo.

## Edge:
Modella il concetto di arco presente nel grafo, questo oggetto a mio avviso è tra i più difficili da modellare correttamente attraverso la programmazione ad oggetti poichè si deve 
modellare il fatto che un arco potenzialmente ha un peso e una direzione ben definita.
Il Vertice è una coppia di vertici (u,v) ordinata o non e a cui può essere applicato un peso che può descrivere ciò un utente desidera modellare attraverso un grafo.

La classe edge non è instanziabile poichè è astratta e dentro di essa contiene tre attributi privati : Node u , Node v e un booleano HasDirection. 
Quest'ultimo attributo permette la distinzione fra un arco orientato e uno non orientato e si può accedere ad esso attravero un metodo hasDirection.

la sottoclasse WeightedEdge descrive quell'insieme di grafi a cui è effettivamente applicato un peso che è rappresentato da un tipo generico il quale può essere un qualsiasi tipo Wrapper(per ora solo che implementa l'interfaccia Comparable).

Le sottoclassi DirectedEdge e UnDirectedEdge descrivono finalmente la distizione fra un tipo di arco orientato e un non orientato.
Questa distinzione (insieme al metodo hasDirection) permette all'utente di essere sicuro di quale arco vuole inserire in un grafo.

## EdgeFactory
Questa classe vuole implementare il design pattern : FactoryPattern in cui si affida a un oggetto di istanziare delle famiglie di oggetti che hanno senso di stare insieme logicamente ma non mischiate. Per esempio :un directed può stare solo con la sua versione pesata.
                        e così anche con l'UnDirected e la sua versione pesata.

Un Directed e UnDirected insieme ,in questa implmentazione della libreria, ritengo che senza senso anche se esistono grafi che contengono archi orientati.
