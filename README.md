# raster-trace-alert-loom

`raster-trace-alert-loom` explores observability with a small Scala codebase and local fixtures. The technical goal is to package a Scala local lab for alert analysis with safe and unsafe fixtures, remediation hints, and documented operating limits.

## Why It Exists

I want this repository to be useful as a quick reading exercise: fixtures first, implementation second, verifier last.

## Raster Trace Alert Loom Review Notes

For a quick review, compare `latency skew` with `signal loss` before reading the middle cases.

## Features

- `fixtures/domain_review.csv` adds cases for span volume and latency skew.
- `metadata/domain-review.json` records the same cases in structured form.
- `config/review-profile.json` captures the read order and the two review questions.
- `examples/raster-trace-alert-walkthrough.md` walks through the case spread.
- The Scala code includes a review path for `latency skew` and `signal loss`.
- `docs/field-notes.md` explains the strongest and weakest cases.

## Architecture Notes

The implementation keeps the scoring rule plain: reward signal and confidence, preserve slack, penalize drag, then classify the result into a review lane.

The added Scala path is deliberately direct, with fixtures doing most of the explaining.

## Usage

```powershell
powershell -NoProfile -ExecutionPolicy Bypass -File scripts/verify.ps1
```

## Tests

That command is also the regression path. It verifies the domain cases and catches mismatches between the CSV, metadata, and code.

## Limitations And Roadmap

The repository is intentionally scoped to local checks. I would expand it by adding adversarial fixtures before adding features.
