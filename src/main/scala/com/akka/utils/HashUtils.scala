package com.akka.utils

object HashUtils {
  def generateHash(uniqueId: String, numBits: Int, hashingAlgorithm: String) = {
    val md = java.security.MessageDigest.getInstance(hashingAlgorithm).digest(uniqueId.getBytes("UTF-8")).map("%02x".format(_)).mkString
    val bin = BigInt(md, 16).toString(2).take(numBits)
    val hashed_id = Integer.parseInt(bin, 2)
    hashed_id
    //md.substring(0, numBits)
  }
}
