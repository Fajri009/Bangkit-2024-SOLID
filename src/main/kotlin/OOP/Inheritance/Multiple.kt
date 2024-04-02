package OOP.Inheritance

// Di mana sebuah class dapat mewarisi lebih dari satu SuperClass
interface Ovipar

interface Vivipar

interface Ovovivipar: Ovipar, Vivipar

class Snake: Ovovivipar