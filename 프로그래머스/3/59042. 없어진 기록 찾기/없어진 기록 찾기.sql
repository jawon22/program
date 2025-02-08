SELECT O.ANIMAL_ID, O.NAME FROM ANIMAL_INS I right outer JOIN ANIMAL_OUTS O
ON I.ANIMAL_ID = O.ANIMAL_ID
WHERE O.NAME IS NOT NULL AND I.NAME IS NULL 
ORDER BY O.ANIMAL_ID