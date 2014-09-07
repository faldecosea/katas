(ns code-katas-2.core)


(defn unpartial
  "Escribir una funcion que acepte una funcion parcial con cantidad de argumentos desconocida,
   retornar una funcion equivalente de n argumentos"
  [f]
  
  )




  "1) preguntar si son todos los cabezales iguales, 2) si o son, tengo que encontrar el menor, 
reduce min (map first seq) , 
3) recursion 
contar el menor cabezal de las listas que tengo"
(defn search
  "Dado un numero cualquiera de secuencias, cada una ya ordenada de menor a mayor, encontrar el numero
   mas chico que aparezca en todas las secuencias, las secuencias pueden ser infinitas."

  [& seqs]
   (def xa (to-array seqs))
   (if (= (alength xa)) 1) (ffirst xa)  )

"paso todos los argumentos a un array, luego veo cuantos son, 
si son uno, agarro el primero del primero, que seria el primer elemento del unico array que hay, 
ya que esta ordenado de menor a mayor"
  


(defn intercalar
  "Escriba una funcion que tome un predicado de 2 argumentos, un valor y una coleccion, y
   retorne una nueva coleccion donde el valor es insertado intercalado cada dos argumentos
   que cumplan el predicado"
  [predicado valor secuencia]
  "



(defn my-map
 [f s]
  (lazy-seq 
    (when (seq s)
       (cons (f (first s))
             (my-map f (rest s)))))) 
"
  )

 "Escriba una funcion que retorne una secuencia lazy que comprima el tartamudeo de una secuencia de numeros.
   Comprimir el tartamudeo se refiere a que [1 1 1] se exprese como [3 1] y a su vez [3 1] se exprese como [1 3 1 1].

   La funcion debe aceptar una secuencia inicial de numeros, y devolver una secuencia infinita de compresiones, donde
   cada nuevo elemento es el elemento anterior comprimido.
   
con un for tendria que recorrer la secuencia y contar o agrupar por numero y segun la cantidad pongo primero la cantidad y luego el numero
como una especie de diccionario {1: 3 , 2: 3, 3:1} el uno aparece 3 veces entonces [3 1 3 2 1 3] y sobre lo que se genero vuelvo a hacer lo mismo
(for [x secuencia]  (assoc actual x 1) ))
   (return actual)

(for [x (secuencia) :when (complement(contains? actual x))] x)

(+ (actual x) 1)
"

(defn tartamudeo
  [secuencia]
  (def cantidad 0)
  (def iterador (first secuencia))
  (for [x secuencia :when (= iterador x)] (inc(cantidad)))
)


  "
la idea con la funcion que no pude implementar de arriba era recorrer la secuencia hasta que sea distinto
y llevar un contador de las veces que aparecio ese numero, 
luego agregar con conj al final de un array ejemplo [.... 3 1 ]
poniendo luego la cantidad de apariciones a 0 
y cambiando el valor por el siguiente hasta que termine de recorrer el array 
cuando lo termine de recorrer llama a la misma funcion con el array nuevo generado basado en la secuencia anterior.

[1 1 1]

[3 1]
[1 3 1 1]
[1 1 1 3 2 1]
[3 1 1 3 1 2 1 1]
[1 3 2 1 1 3 1 1 1 2 2 1]
[1 1 1 3 1 2 2 1 1 3 3 1 2 1 1 1]
[3 1 1 3 1 1 2 2 2 1 2 3 1 1 1 2 3 1]
"
 
