package uk.org.mule.jwt.internal;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.SignatureAlgorithm;

enum JwtAlgorithm {
    ES256(Jwts.SIG.ES256),
    ES384(Jwts.SIG.ES384),
    ES512(Jwts.SIG.ES512),
    PS256(Jwts.SIG.PS256),
    PS384(Jwts.SIG.PS384),
    PS512(Jwts.SIG.PS512),
    RS256(Jwts.SIG.RS256),
    RS384(Jwts.SIG.RS384),
    RS512(Jwts.SIG.RS512);

    private final SignatureAlgorithm algorithm;

    SignatureAlgorithm getAlgorithm() {
        return algorithm;
    }

    JwtAlgorithm(final SignatureAlgorithm algorithm) {
        this.algorithm = algorithm;
    }
}
